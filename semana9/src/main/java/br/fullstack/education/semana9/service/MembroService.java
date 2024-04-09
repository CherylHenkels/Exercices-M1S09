package br.fullstack.education.semana9.service;

import br.fullstack.education.semana9.entity.MembroEntity;
import br.fullstack.education.semana9.entity.MembroEntity;
import br.fullstack.education.semana9.repository.MembroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembroService {

    private final MembroRepository membroRepository;
    public MembroService(MembroRepository membroRepository) {
        this.membroRepository = membroRepository;
    }

    public List<MembroEntity> listaMembros() {
        return membroRepository.findAll();
    }

    public MembroEntity salvaMembro(MembroEntity membroEntity) {
        return membroRepository.save(membroEntity);
    }

    public void deletarMembro(Long id) {
        membroRepository.deleteById(id);
    }

    public MembroEntity atualizaMembro(MembroEntity membroEntity) {
         membroRepository.update(membroEntity.getId(),
                membroEntity.getNome(),
                membroEntity.getEndereco(),
                membroEntity.getTelefone());
        return membroRepository.save(membroEntity);
    }

    public MembroEntity buscarPorId(Long id) throws Exception {
        List<MembroEntity> membros = membroRepository.findAll();
        for (MembroEntity membro : membros) {
            if (membro.getId().equals(id)) {
                return membro;
            }
        }
        throw new Exception("Membro não encontrado");
    }
}
