export interface Administrator {
  id: number;
  lastName: string;
  firstName: string;
  email: string;
  description: string;
  gender: Gender;
  password: string;
  phone: string;
  imageURL: string;
}

export enum Gender {
  M,
  Mme
}
