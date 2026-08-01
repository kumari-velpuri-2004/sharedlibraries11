def gitDownload(repo)
{
  git "https://github.com/kumari-velpuri-2004/${repo}.git"
}

def buildArtifact()
{
  sh 'mvn package'
}

def deployTomcat(jobname,ip,context)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war ubuntu@${ip}:/var/lib/tomcat10/webapps/${context}.war"
}


