
<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>calculator</title>
  </head>
   <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
  <body>
 <div id="content w-10 p-3 ">
<div class="container py-4 mt-2  ">
<div class="card card-body " >
  <form action="calculator.html" method=get >
  <div class="form-group">
    <label for="formGroupExampleInput">Enter a Number</label>
    <input type="number" class="form-control" id="n1" placeholder="First number" name=n1>
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Enter a Number</label>
    <input type="number" class="form-control" id="n1" placeholder="Second number" name=n2>
  </div>
  <div class="form-group">
    <label for="formGroupExampleInput2">Result</label>
    <input type="number" class="form-control" id="res" placeholder="Result" value=n3>
  </div>
  <input type="Submit" class="btn btn-danger" value=ADD name=bt>
  <input type="Submit" class="btn btn-danger" value=SUB name=bt>
  <input type="Submit" class="btn btn-danger" value=MUL name=bt>
  <input type="Submit" class="btn btn-danger" value=DIV name=bt>
</form>
</div>
</div>
</div>
    

   
  </body>
</html>