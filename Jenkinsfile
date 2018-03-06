@Library('CICD-GROOVY')
node() {
   deleteDir();
   stage ("Release - Build") {
       checkout url: gitRepoUrl
   }
}