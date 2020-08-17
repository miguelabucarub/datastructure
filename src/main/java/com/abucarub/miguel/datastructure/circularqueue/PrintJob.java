package com.abucarub.miguel.datastructure.circularqueue;

/*
 * Teste C#
 * 	PrintJob
 * 	Esta classe representa um arquivo a ser impresso e tem como atributos o nome e o
 *  n�mero de p�ginas do arquivo. O n�mero de p�ginas ser� usado pela impressora para
 *  �imprimir� o trabalho. Quanto maior o n�mero de p�ginas mais tempo a impressora
 *  levar� para imprimi-lo.
 * 
 */
class PrintJob {

	private final int numberOfPage;
	private final String jobName;

	PrintJob(String jobName, int numberOfPage) {
		this.jobName = jobName;
		this.numberOfPage = numberOfPage;
	}

	public String getJobName() {
		return jobName;
	}

	public int getNumberOfPage() {
		return numberOfPage;
	}

	@Override
	public String toString() {
		return "";
	}

}