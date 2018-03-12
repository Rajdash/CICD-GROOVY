@Library('CICD-GROOVY@master')
node() {
   deleteDir();
   stages{
   stage ("Release - Build") {
       checkout url: gitRepoUrl
   }
   }
}
