<?php
//koneksi
// definisikan koneksi ke database
 include './config/koneksi.php';
  //mysqli_select_db($database) or die("Database tidak bisa dibuka");
   
    if(isset($_GET["id_makanan"])){
        $id=$_GET["id_makanan"];
    }
    //query untuk menampilkan semua data ditable
    $sql=mysqli_query($con,"SELECT * FROM makanankhas ORDER BY id_makanan desc");
    //untuk menampung isi data
    $response=array();
    $cek=mysqli_num_rows($sql);
    if($cek >0){
        $response["makanan"]=array();
        //perulangan
        while ($row=mysqli_fetch_array($sql)){
            $data=array();
            $data["id_makanan1"]=$row["id_makanan"];
            $data["nama1"]=$row["nama"];
            $data["detail1"]=$row["detail"];
           $data["gambar1"]=$row["gambar"];
           $data["harga1"]=$row["harga"];
           $data["status1"]=$row["status"];
            
         $response["pesan"]="berhasil Mengambil Data";
         $response["sukses"]="true";    
            array_push($response["makanan"],$data);
        }
        echo json_encode($response);
    }else{
        $response["pesan"]="Gagal Mengambil Data";
        $response["sukses"]="false";
        echo json_encode($response);
    } 

?>
