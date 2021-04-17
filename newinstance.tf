resource "aws_instance" "MyfirstInstance" {
   count = 1
   ami = "ami-0b55b3040fb5668a3"
   instance_type = "t2.micro" 
   tags = {
     "Name" = "demoec2test-${count.index}"
   }
}
