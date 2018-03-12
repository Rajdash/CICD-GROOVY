@Library('CICD-GROOVY@master')
node() {
  
   stage ('Release - Build') {
       deleteDir();
       git 'https://github.com/Rajdash/CICD-GROOVY.git'
      
   }
   stage ('Release - deploy') {
       sh "echo deployed"
   }

}
