#!/usr/bin/env groovy

node {
    stage('checkout') {
        checkout scm
    }
    stage('deploy while kubectl config completely') {
        // sh 'curl -LO "https://dl.k8s.io/release/$(curl -L -s https://dl.k8s.io/release/stable.txt)/bin/linux/amd64/kubectl"'
        // sh 'ls ~/.local/bin/'
        // sh 'install -o root -g root -m 0755 kubectl /usr/local/bin/kubectl'
        // sh 'mkdir -p ~/.local/bin/kubectl'
        // sh 'mv ./kubectl ~/.local/bin/kubectl'
        // sh 'chmod 755 ~/.local/bin/kubectl/kubectl'
        // sh 'kubectl version'
        sh 'export PATH=$PATH:/var/jenkins_home/.local/bin/kubectl && kubectl apply -f src/main/k8s/jhipsterbugtrackerdemo-app-deployment.yaml'
    }
}
