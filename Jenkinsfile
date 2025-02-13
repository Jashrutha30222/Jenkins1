        stage('Build') {
            steps {
                sh './gradlew clean build'
            }
        }

        stage('Run Tests') {
            steps {
                sh './gradlew test'
            }
        }

        stage('Publish Test Results') {
            steps {
                junit '**/build/test-results/test/*.xml'
            }
        }
