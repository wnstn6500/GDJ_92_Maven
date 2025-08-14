/**
 * 
 */

//전체 체크박스를 클릭했을 때
const checkAll = document.getElementById("checkAll");
const ch = document.querySelectorAll(".ch")
const frm = document.getElementById("frm")
const del = document.getElementById("del")

del.addEventListener("click", ()=>{
	frm.submit();
})

checkAll.addEventListener("click", ()=>{
	
	ch.forEach((item)=>{
		console.log( checkAll.checked)
		item.checked=checkAll.checked
	});
	
})

ch.forEach((item)=>{
	item.addEventListener("click", ()=>{
		let flag=true;
		ch.forEach((c)=>{
			console.log(c.checked)
			if(!c.checked){
				flag=false;
				return;
			}
		})
		checkAll.checked=flag;
	})
})