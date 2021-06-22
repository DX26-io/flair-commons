node {
    stage('Checkout SCM') {
        checkout scm
    }
    stage('Test and Package') {
        steps {
            echo '[INFO] Test and Package'
        }
        steps {
            echo '[INFO] Publish tests'
        }
    }
    stage('Deploy Artifact') {
        steps {
            echo '[INFO] Deploy Artifacts'
        }
    }
}
