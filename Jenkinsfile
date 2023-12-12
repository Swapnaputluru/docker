pipeline {
  agent any 
  stages {
    stage("Demo"){
      steps {
        git branch: 'main', url: 'https://github.com/Swapnaputluru/docker.git'
        sh "ls"
        sh "cat Jenkinsfile"
      }
    }
  }
}
