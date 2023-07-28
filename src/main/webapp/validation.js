function Loginvalidation() 
{
	UserName = document.getElementById("uname").value
	if (UserName == "")
	{
		document.getElementById("unameError").innerHTML = "Enter emailID"
		return false;
	}
	Password = document.getElementById("pass").value
	if (Password == "")
	{
		document.getElementById("passError").innerHTML = "Enter password"
		return false;
	}
	return true
}
/*_________________________________________________________________________________________________________________________*/

function AddFoodValidation()
{
	FoodName = document.getElementById("FName").value
	if (FoodName == "")
	{
		document.getElementById("foodNameError").innerHTML = "Enter Food"
		return false;
	}
	FoodType = document.getElementById("FType").value
	if (FoodType == "")
	{
		document.getElementById("foodTypeError").innerHTML = "Enter Food Type "
		return false;
	}
	FoodCtegory = document.getElementById("FCategory").value
	if (FoodCtegory == "")
	{
		document.getElementById("foodCategoryError").innerHTML = "Enter Food category "
		return false;
	}
	Price = document.getElementById("FPrice").value
	if (Price == "")
	{
		document.getElementById("foodPriceError").innerHTML = "Enter Food price "
		return false;
	}
	return true
}
/*_______________________________________________________________________________________________________________________________*/	

function UpdateFoodValidation()
{
	ExistingFoodId = document.getElementById("FId").value
	if (ExistingFoodId == "")
	{
		document.getElementById("idError").innerHTML = "Enter Food Id"
		return false;
	}
	FoodName = document.getElementById("FName").value
	if (FoodName == "")
	{
		document.getElementById("foodNameError").innerHTML = "Enter Food"
		return false;
	}
	FoodType = document.getElementById("FType").value
	if (FoodType == "")
	{
		document.getElementById("foodTypeError").innerHTML = "Enter Food Type "
		return false;
	}
	FoodCtegory = document.getElementById("FCategory").value
	if (FoodCtegory == "")
	{
		document.getElementById("foodCategoryError").innerHTML = "Enter Food category "
		return false;
	}
	Price = document.getElementById("FPrice").value
	if (Price == "")
	{
		document.getElementById("foodPriceError").innerHTML = "Enter Food price "
		return false;
	}
	return true
}
/*____________________________________________________________________________________________________________________________*/

function AddCustomerValidation()
{
	Name = document.getElementById("CName").value
	if (Name == "")
	{
		document.getElementById("cnameError").innerHTML = "Enter Name"
		return false;
	}
	EmailId = document.getElementById("CEmail").value
	if (EmailId == "")
	{
		document.getElementById("cemailError").innerHTML = "Enter Email Id"
		return false;
	}
	Address = document.getElementById("add").value
	if (Address == "")
	{
		document.getElementById("caddressError").innerHTML = "Enter Address"
		return false;
	}
	ContactNo = document.getElementById("CNo").value
	if (ContactNo == "")
	{
		document.getElementById("ccontactError").innerHTML = "Enter contact no"
		return false;
	}
	return true
}
/*______________________________________________________________________________________________________________________________*/

function UpdateCustomerValidation()
{
	ExistingEmailId = document.getElementById("CEmail").value
	if (ExistingEmailId == "")
	{
		document.getElementById("cemailError").innerHTML = "Enter Email Id"
		return false;
	}
	Name = document.getElementById("CName").value
	if (Name == "")
	{
		document.getElementById("cnameError").innerHTML = "Enter Name"
		return false;
	}
	
	Address = document.getElementById("add").value
	if (Address == "")
	{
		document.getElementById("caddressError").innerHTML = "Enter Address"
		return false;
	}
	ContactNo = document.getElementById("CNo").value
	if (ContactNo == "")
	{
		document.getElementById("ccontactError").innerHTML = "Enter contact no"
		return false;
	}
	return true
}
/*_________________________________________________________________________________________________________________________*/

function ChangePasswordValidation()
{
	EmailId = document.getElementById("Eid").value
	if (EmailId == "")
	{
		document.getElementById("emailError").innerHTML = "Enter Email Id"
		return false;
	}
	OldPassword = document.getElementById("Opass").value
	if (OldPassword == "")
	{
		document.getElementById("oldPassError").innerHTML = "Enter password"
		return false;
	}
	NewPassword = document.getElementById("Pass").value
	if (NewPassword == "")
	{
		document.getElementById("newPassError").innerHTML = "Enter  New password"
		return false;
	}
	ConfirmPassword = document.getElementById("CPass").value
	if (ConfirmPassword == "")
	{
		document.getElementById("confirmPassError").innerHTML = "Confirm password"
		return false;
	}
	return true
}
	











