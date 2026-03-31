public class ArvoreDeDecisao {
    private Nodo raiz;

    public ArvoreDeDecisao() {
        this.raiz = montarArvore();
    }

    public Nodo getRaiz() {
        return this.raiz;
    }

    private Nodo montarArvore() {
        Nodo n1 = new Nodo("O bico da ave é comprido (maior que a largura da cabeça)?");

        Nodo n2 = new Nodo("O bico é curvado para baixo ou para cima?");
        n1.setSim(n2);

            Nodo n3 = new Nodo("A ave é predominantemente rosa?");
            n2.setSim(n3);
                n3.setSim(new Nodo("Ave H"));
                
                Nodo n4 = new Nodo("O bico é muito largo e colorido?");
                n3.setNao(n4);
                    n4.setSim(new Nodo("Ave J"));
                    
                    Nodo n5 = new Nodo("O bico é fino e curvado para CIMA?");
                    n4.setNao(n5);
                        n5.setSim(new Nodo("Ave D"));
                        
                        Nodo n6 = new Nodo("A ave possui uma 'máscara' branca na face?");
                        n5.setNao(n6);
                            n6.setSim(new Nodo("Ave G"));
                            n6.setNao(new Nodo("Ave I"));

            Nodo n7 = new Nodo("A ave possui um topete ou detalhe vermelho na cabeça?");
            n2.setNao(n7);
                
                Nodo n8 = new Nodo("O bico é totalmente preto?");
                n7.setSim(n8);
                    n8.setSim(new Nodo("Ave M"));
                    n8.setNao(new Nodo("Ave K"));

                Nodo n9 = new Nodo("O bico tem duas cores?");
                n7.setNao(n9);
                    n9.setSim(new Nodo("Ave C"));
                    n9.setNao(new Nodo("Ave N"));

        Nodo n10 = new Nodo("A ave possui uma crista ou penas longas no topo da cabeça?");
        n1.setNao(n10);

            n10.setSim(new Nodo("Ave P"));

            Nodo n11 = new Nodo("A ave é predominantemente preta ou escura?");
            n10.setNao(n11);

                Nodo n12 = new Nodo("O bico é amarelado ou tem detalhes amarelos perto dos olhos?");
                n11.setSim(n12);
                    n12.setSim(new Nodo("Ave O"));
                    
                    Nodo n13 = new Nodo("A ave possui o 'peito' ou garganta alaranjada?");
                    n12.setNao(n13);
                        n13.setSim(new Nodo("Ave E"));
                        n13.setNao(new Nodo("Ave A"));

                Nodo n14 = new Nodo("A ave possui uma mancha circular laranja na bochecha?");
                n11.setNao(n14);
                    n14.setSim(new Nodo("Ave B"));
                    
                    Nodo n15 = new Nodo("A cabeça da ave é marrom e o bico é avermelhado?");
                    n14.setNao(n15);
                        n15.setSim(new Nodo("Ave L"));
                        n15.setNao(new Nodo("Ave F"));

        return n1; 
    }
}
