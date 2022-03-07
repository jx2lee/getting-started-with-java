package io.github.jx2lee.getting.started.with.java.optional.combination_part1;

public class CompanyCardService {

    public Company getCompany(Member member) {
        return new Company(member.getCompanyName());
    }

    public Card createCard(Member member, Company company) {
        return new Card(member, company);
    }
}
