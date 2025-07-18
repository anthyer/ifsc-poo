package ads.poo;

public class Pilha<T> {
    private T[] dados;
    private int indice;

    @SuppressWarnings("unchecked")
    public Pilha(int tamanho) {
        this.dados = (T[]) new Object[tamanho];
        this.indice = 0;
    }

    public boolean empilhar(T obj) throws PilhaCheiaException {
        if(!isCheia()){
            this.dados[this.indice] = obj;
            this.indice++;
            return true;
        }
        throw new PilhaCheiaException("A pilha está cheia");
    }

    public T desempilhar() throws PilhaVaziaException {
        if(!isVazia()){
            T aux = this.dados[this.indice];
            this.dados[this.indice] = null;
            this.indice--;
            return aux;
        }
        throw new PilhaVaziaException("A pilha está vazia");
    }

    public T getTopo(){
        return this.dados[this.indice-1];
    }

    public boolean isCheia() {
        if(this.indice == this.dados.length){return true;}
        return false;
    }

    public boolean isVazia() {
        if(indice == 0){return true;}
        return false;
    }
}
