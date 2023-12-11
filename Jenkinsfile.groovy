pipeline {
    agent any
    stages {
        stage("Git clone") {
            steps {
                git branch: 'main', url: 'https://github.com/Swapnaputluru/docker.git'
                sh "ls"
            }
        }
        stage("Build image") {
            steps {
                sh 'docker build -t demo . '
                sh "docker images"
            } 
        }
        stage("Run image") {
            steps {
                sh 'docker stop cont1'
                sh 'docker rm cont1'
                sh 'docker run -dit -p 80:80 --name cont1 nginx '
                sh "docker ps"
                
                
            } 
        }
    }
}
