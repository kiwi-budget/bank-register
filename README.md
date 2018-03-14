# bank-register

<img src="https://travis-ci.org/kiwi-budget/bank-register.svg?branch=master" />

[Helm Install](https://docs.helm.sh/using_helm/#installing-the-helm-client)

Minikube instructions
    
    $ minikube start
    $ minikube docker-env
    $ eval $(minikube docker-env)
    
Gradle, docker build

    $ git clone https://github.com/kiwi-budget/bank-register.git
    $ cd bank-register
    $ gradle clean build -x test
    $ docker build -t bank-register .

Helm install postgresql and bank-register

    $ helm install -f postgresql/values.yaml stable/postgresql --name bank-registry-psql
    $ helm install --name bank-register ./bank-register
    
When Helm revision is already deployed, two ways to deploy new revision

    $ helm delete --purge bank-register
    or 
    $ helm upgrade --install bank-register ./bank-register

Navigate to url after running below command to test endpoints

    $ minikube service bank-register --url
