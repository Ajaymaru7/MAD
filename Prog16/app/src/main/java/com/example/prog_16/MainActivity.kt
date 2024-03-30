package com.example.prog_16

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etEmployeeCode: EditText
    private lateinit var etEmployeeName: EditText
    private lateinit var etEmployeeDepartment: EditText
    private lateinit var etEmployeeBasicSalary: EditText
    private lateinit var btnCalculate: Button
    private lateinit var tvGrossSalary: TextView
    private lateinit var tvNetSalary: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etEmployeeCode = findViewById(R.id.etEmployeeCode)
        etEmployeeName = findViewById(R.id.etEmployeeName)
        etEmployeeDepartment = findViewById(R.id.etEmployeeDepartment)
        etEmployeeBasicSalary = findViewById(R.id.etEmployeeBasicSalary)
        btnCalculate = findViewById(R.id.btnCalculate)
        tvGrossSalary = findViewById(R.id.tvGrossSalary)
        tvNetSalary = findViewById(R.id.tvNetSalary)

        btnCalculate.setOnClickListener {
            calculateSalary()
        }
    }

    private fun calculateSalary() {
        val basicSalary = etEmployeeBasicSalary.text.toString().toDouble()
        val hra = basicSalary * 0.05
        val da = basicSalary * 0.12
        val ta = calculateTA(etEmployeeDepartment.text.toString())
        val allowance = hra + da + ta
        val grossSalary = basicSalary + allowance
        val tax = calculateTax(grossSalary)
        val netSalary = grossSalary - tax

        tvGrossSalary.text = "Gross Salary: $grossSalary"
        tvNetSalary.text = "Net Salary: $netSalary"
    }

    private fun calculateTA(department: String): Double {
        return when (department) {
            "HR" -> 300.0
            "IT" -> 500.0
            "Sales", "Marketing" -> 800.0
            else -> 0.0
        }
    }

    private fun calculateTax(grossSalary: Double): Double {
        return when {
            grossSalary <= 25000 -> 0.0
            grossSalary in 26000.0..75000.0 -> grossSalary * 0.15
            else -> grossSalary * 0.25
        }
    }
}
