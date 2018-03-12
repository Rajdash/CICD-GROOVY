@Library('CICD-GROOVY@master')
node() {
   deleteDir();
 
   stage ('Release - Build') {
       checkout url: gitRepoUrl
   }
   stage ('Release - deploy') {
       sh echo "deployed"
   }

}
