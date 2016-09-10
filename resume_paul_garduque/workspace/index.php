<!DOCTYPE HTML>
<html>
    <head>
        <meta charset="UTF-8">
        <meta name="description" content="This is my resume site,to demonstrate my knowledge of programming languages." />
        <meta name="keywords" content="resume,html,css,php,mysql,paul, garduque,fresno" />
        <link rel="stylesheet" href="css/font-awesome.css" type="text/css" />
        <link rel="stylesheet" href="css/styles.css" type="text/css" />
        <link href='http://fonts.googleapis.com/css?family=Alfa+Slab+One|Aguafina+Script|Alice' rel='stylesheet' type='text/css'/>
        <title>Resume-Paul Garduque</title>
        <div id="timer">
        <?php 
            echo date('m/d/Y - h:ia');
        ?>
        </div>
    </head>
    <body>
     <?php   
    function YOUR_THEME_preprocess_html(&$vars) {
    $hour = date('G');
    $theme = 'day';
      if ($hour <= 6) {
        $theme = 'night';
      }
      elseif ($hour >= 6 && $hour <= 18) {
        $theme = 'day';
      }
      elseif ($hour >= 18) {
        $theme = 'night';
      }
      $vars['classes_array'][] = $theme;
     }
    ?>
        <header>
            <?php 
                include 'header.php'; 
            ?>
                <nav id="menu">
                    <ul>
                        <li class="active"><a href="index.php" title="Home Page">Home</a></li>
                        <li><a href="#" target="_blank" title="About Page">About</a></li>
                        <li><a href="#" target="_blank" title="Contact Page">Contact</a></li>
                        <li><a href="https://resume-paul-garduque-pgarduque.c9.io/phpmyadmin/index.php?token=13e212bbf4675665475c1e5efe9a3d6d&old_usr=pgarduque" target="_blank" title="Paul's Database">Database</a></li>
                    </ul>
                </nav>
        </header>
        <!--TABLE BEGINS HERE-->
            <div class="table">
            <table style="width:100%">
              <tr>
                <td>Jill</td>
                <td>Smith</td>		
                <td>50</td>
              </tr>
              <tr>
                <td>Eve</td>
                <td>Jackson</td>		
                <td>94</td>
              </tr>
              <tr>
                <td>John</td>
                <td>Doe</td>		
                <td>80</td>
              </tr>
            </table>
            </div>
        <!--TABLE ENDS HERE-->
        
            <!--COLUMN 1 BEGINS HERE-->
        <div class="boxA">
                <h2>The Colosseum</h2>
                <div class="box">
                    <a href="#" target="_blank"><img src="img/Colosseum.jpg" alt="Colosseum" title="Roma Rules!"style="width:384px;height:200px;background-color:#0000FF"/></a>
                    <span>is very cool!</span>
                </div>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                quis nostrud exerci tation ullamcorper suscipit lobortis nisl
                ut aliquip ex ea commodo consequat.</p>
                <a href="http://www.bbc.co.uk/history/ancient/romans/colosseum_01.shtml" class="button" target="_blank">Learn More...</a>
            </div>
                <!--COLUMN 1 ENDS HERE-->
                <!--COLUMN 2 BEGINS HERE-->
                <div class="boxB">
                <h2>Computers</h2>
                <div class="box">
                    <a href="#" target="_blank"><img src="img/Computers.jpg" alt="Computers" title="Computers Rule!"style="width:384px;height:200px;background-color:#0000FF"/></a>
                    <span>are very cool!</span>
                </div>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                quis nostrud exerci tation ullamcorper suscipit lobortis nisl
                ut aliquip ex ea commodo consequat.</p>
                <a href="http://www.apple.com/mac/" class="button" target="_blank">Learn More...</a>
            </div>
            <!--COLUMN 2 ENDS HERE-->
            <!--COLUMN 3 BEGINS HERE-->
            <div class="boxC">
                <h2>Coding</h2>
                <div class="box">
                    <a href="#" target="_blank"><img src="img/Coding.jpg" alt="Coding" title="Coding Rules!"style="width:384px;height:200px;background-color:#0000FF"/></a>
                    <span>is the Greatest!</span>
                </div>
                <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                sed diam nonummy nibh euismod tincidunt ut laoreet dolore
                magna aliquam erat volutpat. Ut wisi enim ad minim veniam,
                quis nostrud exerci tation ullamcorper suscipit lobortis nisl
                ut aliquip ex ea commodo consequat.</p>
                <a href="https://www.codecademy.com/" class="button" target="_blank">Learn More...</a>
            </div>
                <!--COLUMN 3 ENDS HERE-->
                
                <!--ABOUT SECTION STARTS HERE-->
                <aside class="align-right">
                 <a href="#" class="button">Read My Personal Bio...</a>
                 <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Maiores, facilis qui natus perferendis alias amet id accusamus impedit ut vero culpa autem quam voluptatum consequatur unde magni rem dignissimos voluptate.</p>
                 </aside>
            </article>
            <!--ABOUT SECTION ENDS HERE-->
        <footer id="copyright">
            <div class="social">
                <a href="www.facebook.com" target="_blank"><i class="fa fa-facebook"></i></a>
                <a href="www.linkedin.com" target="_blank"><i class="fa fa-linkedin"></i></a>
                <a href="www.twitter.com" target="_blank"><i class="fa fa-twitter"></i></a>
            </div>
            <p>&copy;Copyright Paul Garduque | Site by:<a href="www.facebook.com" target="_blank">Paul Garduque</a></p>
            <p>&copy; 2015</p> 
            <div class="contact">
                <ol>
                    <li>
                        Phone:(559)241-4386
                    </li>
                    <li>
                        E-mail:pgarduque@yahoo.com
                    </li>
                </ol>
            </div>
            <div class="container" id="form">
            
            <?php
                $nameErr = $emailErr = $genderErr = $websiteErr = "";
                $name = $email = $gender = $comment = $website = "";
                
                if ($_SERVER["REQUEST_METHOD"] == "POST") {
                   if (empty($_POST["name"])) {
                     $nameErr = "Name is required";
                   } else {
                     $name = test_input($_POST["name"]);
                     // check if name only contains letters and whitespace
                     if (!preg_match("/^[a-zA-Z ]*$/",$name)) {
                       $nameErr = "Only letters and white space allowed"; 
                     }
                   }
                   
                   if (empty($_POST["email"])) {
                     $emailErr = "Email is required";
                   } else {
                     $email = test_input($_POST["email"]);
                     // check if e-mail address is well-formed
                     if (!filter_var($email, FILTER_VALIDATE_EMAIL)) {
                       $emailErr = "Invalid email format"; 
                     }
                   }
                     
                   if (empty($_POST["website"])) {
                     $website = "";
                   } else {
                     $website = test_input($_POST["website"]);
                     // check if URL address syntax is valid (this regular expression also allows dashes in the URL)
                     if (!preg_match("/\b(?:(?:https?|ftp):\/\/|www\.)[-a-z0-9+&@#\/%?=~_|!:,.;]*[-a-z0-9+&@#\/%=~_|]/i",$website)) {
                       $websiteErr = "Invalid URL"; 
                     }
                   }
                
                   if (empty($_POST["comment"])) {
                     $comment = "";
                   } else {
                     $comment = test_input($_POST["comment"]);
                   }
                
                   if (empty($_POST["gender"])) {
                     $genderErr = "Gender is required";
                   } else {
                     $gender = test_input($_POST["gender"]);
                   }
                }
                
                function test_input($data) {
                   $data = trim($data);
                   $data = stripslashes($data);
                   $data = htmlspecialchars($data);
                   return $data;
                }
    ?>
    
    <h2>Send an e-mail to Paul Garduque:</h2>
    <p><span class="error">* required field.</span></p>
    <form method="post" action="mailto:pgarduque@yahoo.com" enctype= "text/plain"> 
       Name: <input type="text" name="name" value="<?php echo $name;?>">
       <span class="error">* <?php echo $nameErr;?></span>
       <br><br>
       E-mail: <input type="text" name="email" value="<?php echo $email;?>">
       <span class="error">* <?php echo $emailErr;?></span>
       <br><br>
       Website: <input type="text" name="website" value="<?php echo $website;?>">
       <span class="error"><?php echo $websiteErr;?></span>
       <br><br>
       Comment: <textarea name="comment" rows="5" cols="40"><?php echo $comment;?></textarea>
       <br><br>
       Gender:
       <input type="radio" name="gender" <?php if (isset($gender) && $gender=="female") echo "checked";?>  value="female">Female
       <input type="radio" name="gender" <?php if (isset($gender) && $gender=="male") echo "checked";?>  value="male">Male
       <span class="error">* <?php echo $genderErr;?></span>
       <br><br>
       <input type="submit" name="submit" value="Submit">
       <input type="reset" name="reset" value="Reset Form">
            </form>

    <?php
        echo "<h2>Your Input:</h2>";
        echo $name;
        echo "<br>";
        echo $email;
        echo "<br>";
        echo $website;
        echo "<br>";
        echo $comment;
        echo "<br>";
        echo $gender;
    ?>
        </div>
        </footer>
    </body>
</html>