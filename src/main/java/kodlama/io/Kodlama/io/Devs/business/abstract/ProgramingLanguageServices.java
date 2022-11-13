package kodlama.io.Kodlama.io.Devs.business.abstract;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageServices {
    List<ProgramingLanguage> getAll();

    void add(ProgramingLanguage programingLanguage) throws Exception;

    void delete(int id) throws Exception;

    ProgramingLanguage getById(int id) throws Exception;

    void update(int id, ProgramingLanguage programingLanguage) throws Exception;
}
