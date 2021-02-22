package com.org.sagar.controller;

import com.org.sagar.model.CompanyDetails;
import com.org.sagar.repository.CompanyRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyRepo repo;

    @PostMapping("/create")
    public void createCompanyController(@RequestBody CompanyDetails c) {
        repo.save(c);
    }

    @PutMapping("/updateRecord")

    public void updateTheDetails() {
        List<CompanyDetails> all = repo.findAll();
        for (int i = 0; i < all.size(); i++) {
            CompanyDetails companyDetails = all.get(i);
                if (companyDetails.getCompanyLocation().equals("bng") ){


                    companyDetails.setCompanyEmployerSalary(2 * companyDetails.getCompanyEmployerSalary());
                    repo.save(companyDetails);
                }
            }
        }
    }




    // @PutMapping("/updateRecord")
    // public void updateTheDetails() {
    // List<CompanyDetails> all = repo.findAll();
  /*      for (int i = 0; i < all.size(); i++) {
            CompanyDetails companyDetails = all.get(i);
            if (companyDetails.getCompanyEmployeName().equals("Hari")) {
                companyDetails.setCompanyLocation("HYD");
                repo.save(companyDetails);
            }
        }
    }
}*/

   /* @PutMapping("/updateRecord")
    public void updateTheDetails() {
        List<CompanyDetails> all = repo.findAll();

        for (int i = 0; i < all.size(); i++) {
            CompanyDetails companyDetails = all.get(i);
            if (companyDetails.getCompanyEmployeGender().equals("Female")) {

                if (companyDetails.getCompanyEmployerSalary()< 20000) {
                    companyDetails.setCompanyEmployeLeave(1);
                    repo.save(companyDetails);*/

/*

                }

            }
        }
    }
}

*/


//            for (int i=0;i<all.size();i++){
//                CompanyDetails companyDetails=all.get(i);
//                if (companyDetails.getCompanyEmployerSalary()>10000){
//                    companyDetails.setCompanyEmployersDesignation("seniorsf");
//                    repo.save(companyDetails);
       // }
   // }
//}




