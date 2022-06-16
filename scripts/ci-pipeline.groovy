pipeline {
    agent any
    stages {
        stage('scm') {
            steps {
                echo 'Downloading the source code'
            }
        }
        stage('build') {
            steps {
                echo 'Building the image'
            }
        }
        stage('test') {
            steps {
                echo 'Testing the image'
            }
        }
        stage('upload') {
            steps {
                echo 'Uploading the image to GCR'
            }
        }
    }
    post { 
        always { 
            echo 'Image uploaded send email'
        }
    }
}
