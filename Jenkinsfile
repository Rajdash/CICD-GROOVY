@Library('CICD-GROOVY@master')
node() {
   deleteDir();
   stage ("Release - Build") {
       checkout url: gitRepoUrl
   }
}