package com.abucarub.miguel.datastructure.circularqueue;

/**
 * A interface QUEUE define a fila de impress�o do tipo FIFO (first in first
 * out). Esta fila de impress�o dever� conter m�todos para adicionar e remover
 * trabalhos. Quando a capacidade da fila for atingida, tentativas de adicionar
 * novos trabalhos ocasionam FullQueueException.IMPORTANTE: Considere para a
 * montagem do seu sistema que existe apenas uma �nica fila de impress�o,
 * thread-safe e compartilhada por printers e producers.
 * 
 * @author miguel.abucarub.neto
 * @Date 17-02-2021
 */
public interface Queue<E> {

	public E dequeue();

	public void enqueue(E item);

	public boolean isEmpty();

	public boolean isFull();

}
