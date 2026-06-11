pipeline {
agent any

```
stages {

    stage('Checkout') {
        steps {
            git 'https://github.com/AkankshaR19/SDET-Capstone-Automation-Framework.git'
        }
    }

    stage('Build & Test') {
        steps {
            bat 'mvn clean test'
        }
    }
}
```

}
