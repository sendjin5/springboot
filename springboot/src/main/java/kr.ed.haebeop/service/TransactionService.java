package kr.ed.haebeop.service;

import kr.ed.haebeop.domain.Emp;
import kr.ed.haebeop.domain.TestVO;
import kr.ed.haebeop.test.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {

    @Autowired
    private TransactionRepository tranRepository;

    public void addCollection(TestVO test, Emp emp){
        tranRepository.addCollection(test, emp);
    }
}
