export class Menu {
  public static menu: Array<any> = [
    {
      oe: [
        { path: "oedashboard",title: "Dashboard", icon: "pe-7s-graph", class: ""  },
        { path: "loandetails",title: "Loan Details", icon: "pe-7s-graph", class: ""  }
      ],
      re: [
        { path: "redashboard", title: "Dashboard", icon: "pe-7s-graph", class: "" },
        {path:"customerenquiry", title:"Add Customer Enquiry"  },
        {path:"customerdetail",title:"Add New Customer"},
        {path:"existingcustomer",title:"Existing Customer"}
       
      ],
      admin: [
        {
          path: "admindashboar", title: "Dashboard", icon: "pe-7s-graph", class: "" }
      ],
      bm: [
        {
          path: "bmdashboard",
          title: "Dashboard",
          icon: "pe-7s-graph",
          class: ""
        }
      ],
      ah: [
        {
          path: "ahdashboard",
          title: "Dashboard",
          icon: "pe-7s-graph",
          class: ""
        }
      ],
      cm: [
        {
          path: "cmdashboard",
          title: "Dashboard",
          icon: "pe-7s-graph",
          class: ""
        }
      ]
    }
  ];
}
