package com.ict2105.ict2105_prototype.ui.me

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ict2105.ict2105_prototype.ItemListAdapter
import com.ict2105.ict2105_prototype.R

class MeFragment : Fragment() {


//    class Image(private var image: Int) {
//        fun getImage(): Int {
//            return image
//        }
//    }
//
//    class CustomAdapter(private var c: Context, private var pics: ArrayList<Image>) : BaseAdapter(){
//
//        override fun getCount(): Int {
//            return pics.size
//        }
//        override fun getItem(i: Int): Any{
//            return pics[i]
//        }
//
//        override fun getItemId(i: Int) : Long{
//            return i.toLong()
//        }
//        override fun getView(i: Int, view: View?, viewGroup: ViewGroup):View{
//            var view = view
//            if(view == null){
//                //inflat layout resources
//                view = LayoutInflater.from(c).inflate(R.layout.profile_grid_layout,viewGroup,false)
//            }
//
//            //get current img
//            val imgs = this.getItem(i) as Image
//
//            //reference imageview from layout
//            val img = view!!.findViewById<ImageView>(R.id.gridCardViewImage) as ImageView
//
//            //bind data to imageview
//            img.setImageResource(imgs.getImage())
//
//            val test = "you click this"
//            //itemclick for gridview
//            view.setOnClickListener { Toast.makeText(c,test,Toast.LENGTH_SHORT).show()}
//
//            return view
//        }
//    }
//
//    //instances field
//    private lateinit var adapter:CustomAdapter
//    private lateinit var gv: GridView
//
//    //data source
//    private val data: ArrayList<Image>
//        get() {
//            val imges = ArrayList<Image>()
//
//            for (x in 0..19){
//                var x = Image(R.drawable.book)
//                imges.add(x)
//            }
//
//            var imge = Image(R.drawable.book
//            )
//            imges.add(imge)
//
//            var imge1 = Image(R.drawable.furniture
//            )
//            imges.add(imge1)
//
//            var imge2 = Image(R.drawable.book
//            )
//            imges.add(imge2)
//
//            var imge3 = Image(R.drawable.furniture
//            )
//            imges.add(imge3)
//
//
//            return imges
//        }
//
//
    private lateinit var meViewModel: MeViewModel
    private lateinit var recyclerViewItemList: RecyclerView
    private val itemList: ArrayList<String> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        meViewModel =
            ViewModelProviders.of(this).get(MeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_me, container, false)
        val textView1: TextView = root.findViewById(R.id.textViewUsername)
        meViewModel.text1.observe(viewLifecycleOwner, Observer {
            textView1.text = it
        })

        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")
        itemList.add("Assorted T-shirts")


        recyclerViewItemList = root.findViewById(R.id.recyclerViewItemList)
        recyclerViewItemList.isNestedScrollingEnabled = false
        recyclerViewItemList.layoutManager = GridLayoutManager(activity, 2, RecyclerView.VERTICAL, false)
        recyclerViewItemList.adapter = ItemListAdapter(itemList)



//        val rating: RatingBar = root.findViewById(R.id.userRatingBar)
//        rating.rating = 3.0f

//        gv = root.findViewById(R.id.listingGridView) as GridView
//
//        adapter = CustomAdapter(activity!!,data)
//        gv.adapter=adapter

        //testing on how to use the view shit
//        val button: Button = root.findViewById(R.id.button)
//        button.setOnClickListener{
//            button.setBackgroundColor(getResources().getColor(R.color.black))
//        }

        return root
    }
}