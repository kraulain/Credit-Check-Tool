package cct_fx.entities;
// Generated Feb 25, 2016 4:18:34 PM by Hibernate Tools 4.3.1



/**
 * AdditionalInfo generated by hbm2java
 */
public class AdditionalInfo  implements java.io.Serializable {


     private int clientId;
     private PersonalDetails personalDetails;
     private Reference referenceByReferenceId2;
     private Reference referenceByReferenceId3;
     private Reference referenceByReferenceId1;
     private boolean isChurchMember;
     private boolean isNjangiMember;
     private boolean isCreditUnionMember;

    public AdditionalInfo() {
    }

    public AdditionalInfo(PersonalDetails personalDetails, Reference referenceByReferenceId2, Reference referenceByReferenceId3, Reference referenceByReferenceId1, boolean isChurchMember, boolean isNjangiMember, boolean isCreditUnionMember) {
       this.personalDetails = personalDetails;
       this.referenceByReferenceId2 = referenceByReferenceId2;
       this.referenceByReferenceId3 = referenceByReferenceId3;
       this.referenceByReferenceId1 = referenceByReferenceId1;
       this.isChurchMember = isChurchMember;
       this.isNjangiMember = isNjangiMember;
       this.isCreditUnionMember = isCreditUnionMember;
    }
   
    public int getClientId() {
        return this.clientId;
    }
    
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
    public PersonalDetails getPersonalDetails() {
        return this.personalDetails;
    }
    
    public void setPersonalDetails(PersonalDetails personalDetails) {
        this.personalDetails = personalDetails;
    }
    public Reference getReferenceByReferenceId2() {
        return this.referenceByReferenceId2;
    }
    
    public void setReferenceByReferenceId2(Reference referenceByReferenceId2) {
        this.referenceByReferenceId2 = referenceByReferenceId2;
    }
    public Reference getReferenceByReferenceId3() {
        return this.referenceByReferenceId3;
    }
    
    public void setReferenceByReferenceId3(Reference referenceByReferenceId3) {
        this.referenceByReferenceId3 = referenceByReferenceId3;
    }
    public Reference getReferenceByReferenceId1() {
        return this.referenceByReferenceId1;
    }
    
    public void setReferenceByReferenceId1(Reference referenceByReferenceId1) {
        this.referenceByReferenceId1 = referenceByReferenceId1;
    }
    public boolean isIsChurchMember() {
        return this.isChurchMember;
    }
    
    public void setIsChurchMember(boolean isChurchMember) {
        this.isChurchMember = isChurchMember;
    }
    public boolean isIsNjangiMember() {
        return this.isNjangiMember;
    }
    
    public void setIsNjangiMember(boolean isNjangiMember) {
        this.isNjangiMember = isNjangiMember;
    }
    public boolean isIsCreditUnionMember() {
        return this.isCreditUnionMember;
    }
    
    public void setIsCreditUnionMember(boolean isCreditUnionMember) {
        this.isCreditUnionMember = isCreditUnionMember;
    }




}


