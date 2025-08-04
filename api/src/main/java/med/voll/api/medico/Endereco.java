package med.voll.api.medico;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import med.voll.api.endereco.DadosEndereco;

@Getter
@NoArgsConstructor
@AllArgsConstructor

@Embeddable
public class Endereco {
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String cep;
    private String uf;

    public Endereco(DadosEndereco dados) {
        this.bairro = dados.bairro();
        this.cidade = dados.cidade();
        this.complemento = dados.complemento();
        this.cep = dados.cep();
        this.uf = dados.uf();
        this.numero = dados.numero();
        this.logradouro = dados.logradouro();
    }

    public void atualizarInformacoes(DadosEndereco dados) {
        if (bairro != null) {
            this.bairro = dados.bairro();
        }
        if (cidade != null) {
            this.cidade = dados.cidade();
        }
        if (complemento != null) {
            this.complemento = dados.complemento();
        }
        if (cep != null) {
            this.cep = dados.cep();
        }
        if (uf != null) {
            this.uf = dados.uf();
        }
        if (numero != null) {
            this.numero = dados.numero();
        }
        if (logradouro != null) {
            this.logradouro = dados.logradouro();
        }
    }
}
