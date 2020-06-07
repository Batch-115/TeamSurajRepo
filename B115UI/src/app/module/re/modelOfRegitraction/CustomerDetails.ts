import { CustomerEmploymentDetails } from './CustomerEmployementDetails';
import { CustomerLoanDetails } from './CustomerLoanDetails';
import { Address } from './Address';
import { Document } from './Document';
import { Product } from './Product';

export class CustomerDetails{

    customerId :number;
    customerFirstName  : string;
    customerMiddleName : string;
    customerLastName: string;
    customerDataOfBirth : string;
    customerGender: string;
    customerMaritailStatus :string;
    customerMobileNumber: string;
    customerEducation : string;
    customerNetMonthlyIncome : string;
    customergmail : string;
    status : number;

    customerAddr:Address;  
    customerDocument:Document;
    customerEmploymentDetails:CustomerEmploymentDetails;
    customerLoanDetails:CustomerLoanDetails;
    productDetails:Product;
    
    public constructor(init?: Partial<CustomerDetails>) {
        Object.assign(this, init);
    }
    
}
