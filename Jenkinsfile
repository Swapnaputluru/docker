pipeline {
  agent any 
  stages {
    stage("Demo"){
      steps {
        git branch: 'sony', url: 'https://github.com/Swapnaputluru/docker.git'
        sh "ls"
        sh "cat Dockerfile"
      }
    }
  }
}
