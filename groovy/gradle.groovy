import hudson.plugins.gradle.GradleInstallation
import hudson.tools.InstallSourceProperty
import hudson.tools.ToolProperty
import hudson.tools.ToolPropertyDescriptor
import hudson.tools.ZipExtractionInstaller
import hudson.util.DescribableList
import jenkins.model.Jenkins

def extensions = Jenkins.instance.getExtensionList(GradleInstallation.DescriptorImpl.class)[0]

List<GradleInstallation> installations = []
def gradle = ['name': 'gradle', 'url':'file:/var/jenkins_home/downloads/jdk-7u76-linux-x64.tar.gz', 'subdir': 'gradle-versionnumberhere']
println("Setting up tool: ${gradle.name}")

def describableList = new DescribableList<ToolProperty<?>, ToolPropertyDescriptor>()
def installer = new ZipExtractionInstaller(gradle.label as String, gradle.url as String, gradle.subdir as String)

describableList.add(new InstallSourceProperty([installer]))
installations.add new GradleInstallation(gradle.name as String, "", describableList)
extensions.setInstallations(installations.toArray(new GradleInstallation[installations.size()]))
extensions.save()
