node {
    stage('Checkout SCM') {
        echo 'Clone SCM'
        checkout scm
    }
    stage('Test and Package') {
        echo '[INFO] Test and Package'
        sh 'mvn clean package'
    }
    stage('Publish results') {
        echo '[INFO] [TODO] Publish tests'
    }
    stage('Deploy Artifact') {
        echo '[INFO] Deploy Artifacts'
        if (env.BRANCH_NAME == 'master') {
            sh 'mvn -B release:clean release:prepare release:perform'
        } else {
            echo '[INFO] Deploy Artifacts skipped as its not master. Use mvn clean deploy to do it manually if needed'
        }
    }
}
