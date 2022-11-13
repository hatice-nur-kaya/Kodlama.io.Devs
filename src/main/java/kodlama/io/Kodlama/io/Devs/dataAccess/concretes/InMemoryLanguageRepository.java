package kodlama.io.Kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import kodlama.io.Kodlama.io.Devs.entities.concretes.ProgramingLanguage;

public class InMemoryLanguageRepository implements ProgramingLanguageRepository {

    List<ProgramingLanguage> languages;
    public InMemoryLanguageRepository() {
        languages = new ArrayList<>();
        languages.add(new ProgramingLanguage(1,"Java"));
        languages.add(new ProgramingLanguage(2,"C#"));
        languages.add(new ProgramingLanguage(1,"Phyton"));

    }

    @Override
    public List<ProgramingLanguage> getAll() {
        return languages;
    }

    @Override
    public void add(ProgramingLanguage programmingLanguages) {
        languages.add(programmingLanguages);
        
    }

    @Override
    public void delete(int id) throws Exception {
        languages.remove(getByid(id));
        
    }

    @Override
    public ProgramingLanguage getByid(int id) throws Exception {
        for (ProgramingLanguage languages: languages){
            if (languages.getId()== id){
                return languages ;
            }
        }
        throw new Exception("Kayıt Bulunamamaktadır.");
    }

    @Override
    public void update(int id, ProgramingLanguage programmingLanguages) throws Exception {
        ProgramingLanguage programmingLanguages1 = getByid(id);
        programmingLanguages1.setName(programmingLanguages.getName());        
    }
    
}
