/*
 * Copyright (C) 2017 Lufthansa Systems GmbH & Co.KG. All rights reserved.
 *
 * This software is the confidential and proprietary information of Lufthansa Systems GmbH & Co.KG.
 */
podTemplate(
        label: 'siddhi',
        containers: [
                containerTemplate(
                        name: 'maven',
                        image: 'maven:3-jdk-9',
                        ttyEnabled: true,
                        command: 'cat')
        ]
) {
    node('siddhi') {
        stage('Prepare') {
            checkout scm
            pom = readMavenPom file: 'pom.xml'
            env.POM_ARTIFACTID = pom.artifactId
            env.POM_VERSION = pom.version
        }
        container('maven') {
            env.MAVEN_OPTS = "-Xmx2048m"
            configFileProvider([configFile(fileId: 'MAVEN_SETTINGS_XML', variable: 'M2_SETTINGS_XML')]) {
                /*Program is maintained and tested by wso2/Matthias Leinweber*/
                stage('Deploy') {
                    sh 'mvn deploy --batch-mode -s ${M2_SETTINGS_XML} -Dmaven.test.skip=true -Dcheckstyle.skip=true'
                }
            }
        }
    }
}
