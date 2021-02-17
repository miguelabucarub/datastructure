package com.abucarub.miguel.datastructure.circularqueue;

/**
 * 	PrintJob
 * 	Esta classe representa um arquivo a ser impresso e tem como atributos o nome e o
 *  numero de paginas do arquivo. O numero de paginas será usado pela impressora para
 *  imprimir o trabalho. Quanto maior o numero de paginas, mais tempo a impressora
 *  levara para  imprimi-lo.
 *  
 * @author miguel.abucarub.neto
 * @Date 17-02-2021
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