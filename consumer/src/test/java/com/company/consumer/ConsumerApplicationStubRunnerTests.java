package com.company.consumer;

import org.assertj.core.api.BDDAssertions;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.cloud.contract.stubrunner.spring.StubRunnerProperties;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = ConsumerApplication.class)
@RunWith(SpringRunner.class)
class ConsumerApplicationStubRunnerTests {

    @Rule
    public StubRunnerRule stubRunnerRule = new StubRunnerRule()
            .downloadStub("com.company", "producer", "0.0.1-SNAPSHOT", "stubs")
            .withPort(8080)
            .stubsMode(StubRunnerProperties.StubsMode.LOCAL);

    @Autowired
    ConsumerClient consumerClient;

    @Test
    public void clientShouldRetrunPersonForGivenID_checkFirsttName() throws Exception {
        BDDAssertions.then(this.consumerClient.getPerson(1).getFname()).isEqualTo("Max");
    }

    @Test
    public void clientShouldRetrunPersonForGivenID_checkLastName() throws Exception {
        BDDAssertions.then(this.consumerClient.getPerson(1).getLname()).isEqualTo("Payne");
    }

}
