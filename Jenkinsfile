pipeline {
  agent any
  stages {
    stage('checkoutCode') {
      steps {
        git(url: 'https://github.com/kabgig/jenkinsTestRepo', branch: 'master')
      }
    }

  }
}