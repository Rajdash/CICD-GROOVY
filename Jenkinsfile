@Library('CICD-GROOVY@master')
node {
  
   stage ('Release - Build') {
       deleteDir();
       checkout url: gitRepoUrl
      
   }
   stage ('Release - deploy') {
       sh "echo deployed"
   }

}
