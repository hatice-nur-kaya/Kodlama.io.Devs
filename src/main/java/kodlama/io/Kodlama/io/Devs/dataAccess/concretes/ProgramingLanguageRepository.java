package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public interface ProgramingLanguageRepository {
    List<ProgramingLanguage> getAll();
    void add(ProgramingLanguage programmingLanguages);
    void  delete( int id) throws Exception;
    ProgramingLanguage getByid(int id) throws Exception;
    void update(int id, ProgramingLanguage programmingLanguages) throws  Exception;
}
