node {
    agent { 'master' }
    stages {
        stage('build&push') {
            steps {
                sh "docker build -t atmohsin/springcicddemo ."
            }
        }
    }

} 