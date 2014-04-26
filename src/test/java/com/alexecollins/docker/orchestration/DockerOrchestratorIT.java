package com.alexecollins.docker.orchestration;

import org.junit.After;
import org.junit.Test;

import java.io.File;

import static org.junit.Assert.assertEquals;


public class DockerOrchestratorIT {
	File src = new File("src/test/docker");
	File workDir = new File("target/docker");
	DockerOrchestrator orchestrator = new DockerOrchestrator(src, workDir, "docker-java-orchestrator");

	@After
	public void tearDown() throws Exception {
		orchestrator.clean();
	}

	@Test
	public void testList() throws Exception {
		assertEquals(1, orchestrator.ids().size());
	}

	@Test
	public void testClean() throws Exception {
		orchestrator.clean();
	}

	@Test
	public void testBuild() throws Exception {
		orchestrator.build();
	}

	@Test
	public void testStart() throws Exception {
		orchestrator.start();
	}

	@Test
	public void testStop() throws Exception {
		orchestrator.stop();
	}
}
