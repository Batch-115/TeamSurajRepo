export class CustomerLoanDetails{
    loanId:number;
    loanCode:string;
    loanAmount:number;
    rateOfInterest:number;
    tenure:number;
    advanceEMI:number;
    processingFees:number;
    totalInterest:number;
    paymentOption:string;
    status:number

    public constructor(init?: Partial<CustomerLoanDetails>) {
        Object.assign(this, init);
    }
    
}