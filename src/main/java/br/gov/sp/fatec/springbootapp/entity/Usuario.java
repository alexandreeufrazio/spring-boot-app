package br.gov.sp.fatec.springbootapp.entity;

@Entity
@Table(name = usr_usuario)
public class Usuario{

    @Id
    @GeneratedValue(Strategy = GenationType.IDENTITY)
    @Column(name = usr_id)
    private Long id;

    @Column(name = usr_nome)
    private String nome;

    @Column(name = usr_senha)
    private String senha;

    public Long getId(){
        return this.id;
    }

    public void setId(Long id){
        this.id = id;  
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSenha(){
        return this.senha;
    }

    public setSenha(String senha){
        this.senha = senha;
    }

}
