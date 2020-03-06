package com.example.ui_quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import com.example.ui_quiz.Adapter.StudentAdapter
import com.example.ui_quiz.Model.Students
import kotlinx.android.synthetic.main.activity_custom_list.*

class CustomListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (supportActionBar != null)
            supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        var  liststudent = mutableListOf<Students>()
        var Students:Students =
            Students(
                "นายทรัพย์ทวี  เพ็ชรสาย",
                "603410203-8",
                "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
                R.drawable.m)
        liststudent.add(Students)
        liststudent.add(Students(
            "นายกฤษฎา ท่าสะอาด",
            "603410032-9",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))


        liststudent.add(Students(
            "นายกัมพล โชติทอง",
            "603410034-5",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายณัฐนนท์ ทาไธสง",
            "603410041-8",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายนฤเบศร์ พระโรจน์",
            "603410047-6",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายพรหมพัฒน์ ชาญโชคประเสริฐ",
            "603410052-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายเมธาวี สารีผล",
            "603410057-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายรัฐเขต สีเหลือง",
            "603410059-9",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายรุ่งโรจน์ พลเยี่ยม",
            "603410060-4",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายวิธาน วงษาบุตร",
            "603410061-2",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นางสาวศศิกร กอเสนาะรส",
            "603410063-8",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นางสาวอนันตยา โคตรศรี",
            "603410070-1",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นายอภิเดช นารอง",
            "603410071-9",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายอุทัยพันธ์ เที่ยงโคตร",
            "603410073-5",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นางสาวพัชรี แอแป",
            "603410155-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นางสาวศศิธร พิมมะทา",
            "603410156-1",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายสุรพร อินพิลึก",
            "603410157-9",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายกฤษดา อุ่นสำโรง",
            "603410194-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายณรงค์ศึก เตชะศรี",
            "603410200-4",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายติยพล ต่อติด",
            "603410202-0",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))



        liststudent.add(Students(
            "นางสาวธิดารัตน์ ดานะพันธ์",
            "603410204-6",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายปิยทัศน์ นวกิจวัฒนา",
            "603410208-8",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายพรสิน มีสีบู",
            "603410210-1",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายพัชรพล ไทยมานี้",
            "603410211-9",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายวงษกร พันธ์พิบูลย์",
            "603410213-5",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายวรรณพงษ์ ภัททิยไพบูลย์",
            "603410214-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นายวิวัฒน์ วงษ์พิชัย",
            "603410217-7",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นางสาวศุภรัตน์ นพวัติ",
            "603410219-3",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นางสาวสิรินาถ จริยพันธ์",
            "603410221-6",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นายเกียรติศักดิ์ วรภาพ",
            "603410289-2",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.m))
        liststudent.add(Students(
            "นางสาวธัญสิริ ผลไสว",
            "603410291-5",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        liststudent.add(Students(
            "นางสาวอาทิตยา ฉิมมาแก้ว",
            "603410321-2",
            "สาขา วิทยาการคอมพิวเตอร์และสารสนเทศ",
            R.drawable.w))
        Log.i("tag",Students.toString())

        var  listView :ListView = findViewById(R.id.Listview) //listview
        listView.adapter = StudentAdapter(this,R.layout.listitem_student,liststudent)
        Listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position:Int, id ->


            //Value of item that is clicked
            val name = liststudent[position].name
            val idstudent = liststudent[position].idstudent
            val major = liststudent[position].major
            val icon = liststudent[position].icon

            //Toast the Values
            Toast.makeText(this,
                "Facebook :" +liststudent[position].idstudent+"\nProfile :  "+liststudent[position].name, Toast.LENGTH_SHORT).show()

            //Intent
            var profile = Intent(this,Profile_Activity::class.java)
            profile.putExtra("name",name)
            profile.putExtra("idstu",idstudent)
            profile.putExtra("major",major)
            profile.putExtra("icon",icon)
            startActivity(profile)
            Log.i("tag",profile.toString())

        }
    }
}

