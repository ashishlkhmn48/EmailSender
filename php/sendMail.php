<?php  
   $to = $_POST["to"];
   $subject = $_POST["subject"];  
   $message = $_POST["message"];  
  
   $result = mail ($to,$subject,$message);  
  
   if( $result == true ){  
      echo "Message sent successfully...";  
   }else{  
      echo "Sorry, unable to send mail...";  
   }  
?>  