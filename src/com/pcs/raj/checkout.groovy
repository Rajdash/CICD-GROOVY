#!/usr/bin/groovy
package com.pcs.raj
def call(LinkedHashMap options) {
    if (options == null || options.url == null) {
        error ("mandatory parameter 'url' is missing")
    }
    //Mandatory options
    def url = options.url

    //Optional options
    def gitSshCredential  = options.get("gitSshCredential") ?: credential.gitSsh
    def branch            = options.get("branch") ?: "master"

    println("Executing ${this.getClass().getSimpleName()} with options ${options}")

    git url: url, branch: branch, credentialsId: gitSshCredential

}
