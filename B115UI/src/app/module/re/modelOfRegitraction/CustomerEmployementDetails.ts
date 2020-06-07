export class CustomerEmploymentDetails{
            employeeDetailsId:number;
            employeeType:string;
			industryType:string;
            nameOfCompany:string;
			desgignation:string;
			addressOfCompany:string;
			status:number

			public constructor(init?: Partial<CustomerEmploymentDetails>) {
				Object.assign(this, init);
			}
}